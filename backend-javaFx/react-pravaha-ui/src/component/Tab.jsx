import React, { useState } from 'react';
import NewTab from './NewTab';
//import './Tab.css';

const Tab = () => {
    const [searchQuery, setSearchQuery] = useState('');
    const [tabs, setTabs] = useState([
        { id: 1, title: 'GitHub', url: 'https://github.com', favicon: '🐙' },
        { id: 2, title: 'Stack Overflow', url: 'https://stackoverflow.com', favicon: '📚' },
        { id: 3, title: 'MDN Web Docs', url: 'https://mdn.mozilla.org', favicon: '📖' },
    ]);

    const filteredTabs = tabs.filter(tab =>
        tab.title.toLowerCase().includes(searchQuery.toLowerCase()) ||
        tab.url.toLowerCase().includes(searchQuery.toLowerCase())
    );

    const handleSearch = (e) => {
        setSearchQuery(e.target.value);
    };

    return (
        <div className="tab-container">
            <NewTab />
            <h1>Browser Tabs</h1>
            <div className="search-box">
                <input
                    type="text"
                    placeholder="Search tabs by title or URL..."
                    value={searchQuery}
                    onChange={handleSearch}
                    className="search-input"
                />
            </div>
            <div className="tabs-list">
                {filteredTabs.length > 0 ? (
                    filteredTabs.map(tab => (
                        <div key={tab.id} className="tab-item">
                            <span className="favicon">{tab.favicon}</span>
                            <div className="tab-info">
                                <h3>{tab.title}</h3>
                                <a href={tab.url}>{tab.url}</a>
                            </div>
                            <a href="https://google.com" target="_blank">Google</a>
                        </div>
                    ))
                ) : (
                    <p className="no-results">No tabs found</p>
                )}
            </div>
        </div>
    );
};

export default Tab;